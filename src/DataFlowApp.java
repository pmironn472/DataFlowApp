//HomeWork from https://github.com/dorinesinenco/EDUQATION/blob/master/programming/java/oop/static/data-tools/DATA.FLOW.CL.STATIC.ru.md




public class DataFlowApp {


    public static void main(String[] args) {
        DataFlowApp.intToByte(130);
        DataFlowApp.byteToInt((byte) 129);
        DataFlowApp.doubleToInt(156.2);
        DataFlowApp.intToDouble(162);
        DataFlowApp.shortToInteger((short) 33.768);
        DataFlowApp.integerToShort(75214);
    }
    static byte intToByte(int value){
        byte b = (byte) value;
        if (value > 127 || value < - 128 ){
            System.err.println("WARNING! the value "+ value +" overflows \"byte\" range. DATA was lost!");
        }else{
        System.out.println(value + " Integer to Byte is " + b);}
        return b;

    }

    static int byteToInt(byte value){
        int b = (int)value;
        System.out.println((byte)value + " Byte to Integer is " + b);
        return (int)b;

    }
    static double doubleToInt(double value){
        int b = (int) value;
        System.out.println(value + " Double to Integer is " + b);
        return b;

    }

    static double intToDouble(int value){
        double b = (double) value;
        if((int)value < -2147483648 || (int)value > 2147483647){
            System.err.println("WARNING! the value "+ value +" overflows \"Integer\" range. DATA was lost!");}
        else{
        System.out.println(value + " Integer to Double is " + b);}
        return b;
    }


    static int shortToInteger(short value){
        int b = (int) value;
        if ((short)value > 32.767 || (short)value < -32.768){
            System.err.println("WARNING! the value "+ value +" overflows \"Short\" range. DATA was lost!");}
        else{
        System.out.println(value + " Short to Integer is " + b);}

        return b;
    }

    static short integerToShort(int value){
        short b = (short) value;
        System.out.println(value + " Integer to Short is " + b);
        return b;
    }



}


