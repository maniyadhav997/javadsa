public class ClassTest2 {
    public static String check(int n1, int n2, int n3) {
        if (n1 < n2 && n2 < n3) {
            String str = "increasing order";
            return str;
        } else if (n1 > n2 && n2 > n3) {
            String str = "decreasing order";
            return str;
        } else {
            String str = "neither increase nor decrease";
            return str;
        }
    }

    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Please provide three integers as command line arguments.");
            return;
        }

        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int n3 = Integer.parseInt(args[2]);

        System.out.println(check(n1, n2, n3));
    }
}
