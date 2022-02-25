import java.util.*;
import Helper.TwelveDaysHelper;

class TwelveDays
{
    static List<String> list=new ArrayList<String>();
    static List<TwelveDaysHelper> verseList=new ArrayList<TwelveDaysHelper>() ;

    static
    {
        list.add("On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.");
        list.add("On the second day of Christmas my true love gave to me: two Turtle Doves, and a Partridge in a Pear Tree.");
        list.add("On the third day of Christmas my true love gave to me: three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.");
        list.add("On the fourth day of Christmas my true love gave to me: four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.");
        list.add("On the fifth day of Christmas my true love gave to me: five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.");
        list.add("On the sixth day of Christmas my true love gave to me: six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.");
        list.add("On the seventh day of Christmas my true love gave to me: seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.");
        list.add("On the eighth day of Christmas my true love gave to me: eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.");
        list.add("On the ninth day of Christmas my true love gave to me: nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.");
        list.add("On the tenth day of Christmas my true love gave to me: ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.");
        list.add("On the eleventh day of Christmas my true love gave to me: eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.");
        list.add("On the twelfth day of Christmas my true love gave to me: twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.");
    }
    static {
        verseList.add(new TwelveDaysHelper("first","a Partridge in a Pear Tree."));
        verseList.add(new TwelveDaysHelper("second","two Turtle Doves"));
        verseList.add(new TwelveDaysHelper("third","three French Hens"));
        verseList.add(new TwelveDaysHelper("fourth","four Calling Birds"));
        verseList.add(new TwelveDaysHelper("fifth","five Gold Rings"));
        verseList.add(new TwelveDaysHelper("sixth","six Geese-a-Laying"));
        verseList.add(new TwelveDaysHelper("seventh","seven Swans-a-Swimming"));
        verseList.add(new TwelveDaysHelper("eighth","eight Maids-a-Milking"));
        verseList.add(new TwelveDaysHelper("ninth","nine Ladies Dancing"));
        verseList.add(new TwelveDaysHelper("tenth","ten Lords-a-Leaping"));
        verseList.add(new TwelveDaysHelper("eleventh","eleven Pipers Piping"));
        verseList.add(new TwelveDaysHelper("twelfth","twelve Drummers Drumming"));

    }
    String verse(int verseNumber)
    {
        String expectedVerse="";
        String childVerse="";
        for(int currentVerseNumber=verseNumber;currentVerseNumber>1;currentVerseNumber--)
        {
           childVerse+=verseList.get(currentVerseNumber-1).getVerse()+", ";
        }
        if(verseNumber==1)
            childVerse+=verseList.get(verseNumber-1).getVerse();
        else if (verseNumber>1 &&verseNumber <=12)
            childVerse+="and "+verseList.get(0).getVerse();
        expectedVerse="On the "+verseList.get(verseNumber-1).getDay()+" day of Christmas my true love gave to me: "+childVerse+"\n";
        return expectedVerse;

    }

    String verses(int startVerse, int endVerse)
    {
        String lyric="";
        for(int start=startVerse;start<endVerse;start++)
        {
            if(start>=1 &&start<=12)
                lyric+=verse(start)+"\n";
        }
        if(endVerse>=1 &&endVerse<=12)
            lyric+=verse(endVerse);
        return lyric;
    }

    String sing() {
        return verses(1,12);
    }

    public static void main(String[] args) {
        TwelveDays twelveDays=new TwelveDays();

        System.out.println(twelveDays.sing());
    }
}