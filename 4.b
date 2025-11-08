// 4.b binary search concept
#include <stdio.h>
struct student
{
    int rno;
    float cgpa;
} s[5];

int main()
{
    int i;
    int mid, low, high, found = 0;
    printf("\nEnter Roll No and CGPA of 5 Students in ascending order:\n");
    for (i = 0; i < 5; i++)
    {
        printf("\nEnter Roll No and CGPA of Student[%d]:", i + 1);
        scanf("%d%f", &s[i].rno, &s[i].cgpa);
    }
    low = 0;
    high = 4;
    printf("\nRoll No. of students having CGPA equal to 6.0:\n");
    while (low <= high)
    {
        mid = (low + high) / 2;
        if (s[mid].cgpa == 6.00)
        {
            printf("\n[%d]", s[mid].rno);
            found = 1;
            break;
        }
        else if (s[mid].cgpa > 6.00)
        {
            high = mid - 1;
        }
        else // if (s[mid].cgpa<6.00)
        {
            low = mid + 1;
        }
    }
    if (found == 0)
    {
        printf("None of student is having CGPA equal to 6.00");
    }
}
