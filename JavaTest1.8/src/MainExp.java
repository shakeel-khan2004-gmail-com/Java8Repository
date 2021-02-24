class MainExp {
    // Function to ind missing number
    static int getMissingNo(int a[], int n)
    {
        int i, total;
        total = (n + 1) * (n + 2) / 2;
        for (i = 0; i < n; i++)
        {
            total -= a[i];
     //   System.out.println("--total--"+total);
        }
        return total;
    }
 
    /* program to test above function */
    public static void main(String args[])
    {
        int a[] = { 1, 2, 3,4, 5, 6,8};
        int miss = getMissingNo(a, 6);
        System.out.println(miss);
    }
}
