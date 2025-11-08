//5,b sort and arrange age using quick sort
#include <stdio.h>

// Function to swap two elements
void swap(int *a, int *b)
{
    int temp = *a;
    *a = *b;
    *b = temp;
}

// Partition function for Quick Sort
int partition(int arr[], int low, int high)
{
    int pivot = arr[high]; // Choosing the last element as pivot
    int i = (low - 1);

    for (int j = low; j < high; j++)
    {
        if (arr[j] <= pivot)
        { // If current element <= pivot
            i++;
            swap(&arr[i], &arr[j]);
        }
    }
    swap(&arr[i + 1], &arr[high]); // Place pivot in correct position
    return (i + 1);
}

// Quick Sort function
void quickSort(int arr[], int low, int high)
{
    if (low < high)
    {
        int pi = partition(arr, low, high);

        // Recursively sort elements before and after partition
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }
}

int main()
{
    int n;
    printf("Enter number of applicants: ");
    scanf("%d", &n);
    int ages[n];
    printf("Enter ages of applicants:\n");
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &ages[i]);
    }
    quickSort(ages, 0, n - 1);
    printf("\nSorted ages for Passport Registration:\n");
    for (int i = 0; i < n; i++)
    {
        printf("%d ", ages[i]);
    }
    printf("\n");
    return 0;
}
