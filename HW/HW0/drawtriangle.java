class TriangleDrawer {
    public static void drawTriangle(int N) {
        int j, n = 1;
        for (j = 0; j < N; j++) {
            int i = 0;
            while (i < n) {
                System.out.print("*");
                i++;
            }
            System.out.print("\n");
            n++;
        }
    }
    public static void main(String[] args) {
        drawTriangle(10);
    }
}

