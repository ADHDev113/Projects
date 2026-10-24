package apps;

public class TimeComplexity
{
    public static void main(String[] args)
    {
        int a = 2;
        int b = 2000;
        int c = 10 + 20;
        int d = 1000 + 2000000;
        int N = 10;

        // T(N)                     // single execution cost        // times
        for (int i = 0; i < N; i++) // c1                           // N + 1
        {                           // c2                           // N
            a = a + 1;
        }
                                    // cost                         // times
        for (int i = 0; i < N; i++) // c1                           // N + 1

        {
            a = a + 1;              // c2                           // N
            b = b + 1;              // c3                           // N
        }
        // T(N) = c1*(N+1) + c2*N + c3*N = 0(N)
        // T(N) = N + N + N

                                        // cost                     // times
        for (int i = 0; i < N; i++)     // c1                       // N + 1
        {
            for (int j = 0; j < N; j++) // c2                       // N (N + 1)
            {
                a = a + 1;              // c3                       // N * N
            }
        }
        // T(N) = 0(N*N) = c1*(N+1) + c2*N*(N+1) + c3*N*N = N + 2N^2

        for (int i = 0; i < N; i++)     // c1                       // N + 1
        {
            for (int j = 0; j < i; j++) // c2                       // N (N + 1) / 2
            {
                a = a + 1;              // c3                       // (N-1) * N / 2
            }
        }
        // T(N) = c1*(N+1) + c2*N(N+1)/2 + c3*(N-1)*N/2 = 0(N*N)

                                            // cost                 // times
        for (int i = 0; i < N; i++)         // c1                   // N + 1
        {
            for (int j = 0; j < N; j++)     // c2                   // N * (N + 1)
            {
                for (int k = 0; k < N; k++) // c3                   // N * N * (N + 1)
                {
                    a = a + 1;              // c4                   // N * N * N
                }
            }
        }
        // T(N) = c1*(N+1) + c2*N*(N+1) + c3*N*N*(N+1) + c4*N*N*N
        // T(N) = N + N^2 + N^3 + N^3 = N + N^2 + 2N^3 = 0(N*N*N)

        for (int i = 0; i < N; i++)         // c1                   // N + 1
        {
            for (int j = 0; j < N; j++)     // c2                   // N*(N + 1)
            {
                a = a + 1;                  // c3                   // N * N
            }
            b = b + 1;                      // c4                   // N
        }
        // T(N) = c1*N+1 + c2*N*(N+1) + c3*(N*N) + c4*N
        // T(N) = N + N*N + N*N + N*N + N = 0(N*N)

        for (int i = 0; i < 10; i++)        // c1                   // 11
        {
            for (int j = 0; j < N; j++)     // c2                   // 10 * (N+1)
            {
                a = a + 1;                  // c3                   // 10 * N
            }
        }
        // T(N) = c1*11 + c2*10*(N+1) + c3*10*N = 0(N)

        for (int i = 0; i < N; i++)         // c1                   // 11
        {
            if (i == 10)                    // c2                   // 11
            {
                break;                      // c3                   // 1
            }
        }
        // T(N) = c1*11 + c2*11 + c3*1 0(1)

        for (int i = 0; i < N; i++)         // c1                   // N + 1
        {
            if (i < 10)                     // c2                   // N
            {
                a = a + 1;                  // c3                   // 10
            }
            else
            {
                b = b + 1;                  // c4                   // N - 10
            }
        }
        // T(N) = c1(N+1) + c2*N + c3*10 + c4(N-10) = 0(N)

        for (int i = 0; i < N; i++)         // c1                   // N + 1
        {
            int[] nums = new int[N];        // 0(N)                 // N
            a = a + 1;                      // c3                   // N
        }
        // T(N) = c1(N+1) + 0(N)*N + c3(N) = 0(N*N)

        int[] nums1 = new int[N];
        int[] nums2 = new int[N];
        // Here some changes happened to those arrays.

        for (int i = 0; i < N; i++)                 // c1           // N + 1
        {
            ArrayDemo.linearSearch(nums2, nums1[i]);// 0(1)~0(N)    // N
        }
        // T(N) = 0(N) ~ 0(N*N)

        for (int i = 0; i < N; i++)                 // c1           // N + 1
        {
            ArrayDemo.binarySearch(nums2, nums1[i]);// 0(1)~0(logN) // N
        }
        // T(N) = 0(N) ~ 0(N*logN)
    }
}
