package com.company;

class LeaderInArray
{
    void printLeaders(int arr[], int size)
    {
        int max_from_right = arr[size-1];

        System.out.print(max_from_right + " ");

        for (int i = size-2; i >= 0; i--)
        {
            if (max_from_right < arr[i])
            {
                max_from_right = arr[i];
                System.out.print(max_from_right + " ");
            }
        }
    }

    public static void main(String[] args)
    {
        LeaderInArray ob = new LeaderInArray();
        int arr[] = new int[]{7, 10, 4, 10, 6, 5, 2};
        int n = arr.length;
        ob.printLeaders(arr, n);
    }
}

