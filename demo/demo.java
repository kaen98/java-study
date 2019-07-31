package demo;

public class demo
{
    // public static void main(String[] args)
    // {
    //     double x = 4;
    //     double y = Math.sqrt(x);

    //     System.out.println(y);
    // }

    // public static void main(String[] args)
    // {
    //     double x = 9.997;
    //     long nx = Math.round(x);

    //     System.out.println(nx);
    // }

    // public static void main(String[] args)
    // {
    //     String a = "Hello";
    //     String b = "Hello";
    //     String c = "hello";

    //     System.out.println(a.equals(b));
    //     System.out.println(a.equals(c));
    //     System.out.println("Hello".equals(b));
    //     System.out.println("Hello".equals(c));
    //     System.out.println("Hello".equalsIgnoreCase(c));
    //     System.out.println("Hello" == b);

    // }

    /**
     * 构建字符串
     */
    public static void main(String[] args)
    {
        StringBuilder builder = new StringBuilder();

        String hello = "Hello";
        String world = "World";

        builder.append(hello);
        builder.append(" ");
        builder.append(world);
        
        String out = builder.toString();
        System.out.println(out);
    }
}