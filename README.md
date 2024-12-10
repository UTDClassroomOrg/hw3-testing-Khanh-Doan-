# INDIVIDUAL HW3
For the "average" function do the following:

 ------------------------------------------------------------------------------------------------------------------

public class Average {

     public int average(int k, int[] list){

                  int average = 0;
                  int n = Math.min(k, list.length);
                  if( n > 0) {
                              for(int i = 0 ; i < n; i++){
                                          average += list[i];
                              }
                              average = average/n;
                  }
                  return average;
      }}
-------------------------------------------------------------------------------------------------------------------

a) Write a brief functional description for the function.

The average function is used to calculate the integer average of the first k elements in an array of integers. It requires two inputs: an odd number k, indicating which odd numbers should be considered, and an odd number array list, indicating which odd numbers should be considered. The function only takes into account the elements that are present in the array if k is larger than the array's length. In case k is not zero or the array does not contain any elements, the function returns zero.

b) Generate functional test case based on functional description.

| Test Case # | Input (`k`, `list`)           | Expected Output | Description                     |
|-------------|-------------------------------|-----------------|---------------------------------|
| 1           | `k=0, list={5, 10, 15}`      | `0`             | No elements so return to average = 0          |
| 2           | `k=-1, list={10, 20, 30, 40}` | `0`            | k is negative so return to average = 0       |
| 3           | `k=3, list={1, 2, 3, 4, 5}`  | `2`             | Average of first 3 elements     |
| 4           | `k=5, list={10, 20}`         | `15`            | `k` exceeds length size          |


c) Identify and specify the partitions and generate partition test cases.

| Test Case # | Input (`k`, `list`)           | Expected Output | Partition Tested                |
|-------------|-------------------------------|-----------------|---------------------------------|
| 1           | `k=0, list={}`               | `0`             | Empty array                    |
| 2           | `k=0, list={1, 2, 3}`        | `0`             | `k = 0`                        |
| 3           | `k=5, list={10, 20, 30}`     | `20`            | `k > array.length`             |
| 4           | `k=3, list={5, 10, 15}`      | `10`            | `k <= array.length`            |


d) Generate boundary value test cases.

| Test Case # | Input (`k`, `list`)           | Expected Output | Boundary Condition              |
|-------------|-------------------------------|-----------------|---------------------------------|
| 1           | `k=0, list=[1, 2, 3]`        | `0`             | Minimum value of `k`            |
| 2           | `k=3, list=[1, 2, 3]`        | `2`             | `k = array.length`              |
| 3           | `k=5, list=[10, 20]`         | `15`            | `k > array.length`              |

e) Implement the average function in a class Average and generate test cases using Junit. (Please also submit this part of the assignment in your individual GitHub classroom code)
[Link](https://github.com/UTDClassroomOrg/hw3-testing-Khanh-Doan-/tree/main/src/average)

f) Compile and run the test cases. Record any failures and errors that are reported. Analyze and briefly explain why each of the failures and errors occurs and how you fix them. Correct all the failures and errors until the CUT (Component Under Test) passes all the test cases.
   1. In case there is no failure, please inject a fault yourself and complete the section f. (That means you need to inject a fault in this average method, and see if your tests can find the fault. For example, instead of i=0, change the code to i=1, or instead of min , use max .. these faults cause the function to not behave as you describe in the section a, and since you design your tests according to this description, your test should be able to reveal the fault and fail. but if your test did not fail after you inject the fault, then you need to redesign and add a new test to reveal your injected fault.)
      
      I injected a mistake myself when changing the loop index of the average method. To find the sum of the first k elements of the array, the loop started at i = 0. However, the first element of the array was excluded from the sum after the error was added by changing i = 0 to i = 1. This caused the process to return an incorrect average. The tests failed because they were designed based on the assumption that the first k elements must be included in the sum. The fix way is to change it back to i = 0.
      
g) Measure the code coverage using a code coverage tools such as EclEmma. Your test case must achieve 100% branch coverage.
   ![](https://github.com/UTDClassroomOrg/hw3-testing-Khanh-Doan-/blob/main/coverage.png)

   # Sources:
- Dr. Kung Book Chapter 20 
- Eclipse with JUnit Test
- https://www.youtube.com/watch?v=v2F49zLLj-8
  
