### 归并排序
归并排序（Merge Sort）是建立在归并操作上的一种有效的排序算法。该算法是采用分治法（Divide and Conquer）的一个非常典型的应用。将已有序的子序列合并，得到完全有序的序列；即先使每个子序列有序，再使子序列段间有序。若将两个有序表合并成一个有序表，称为2-路归并。 
#### 1. 算法描述
* 把长度为 n 的输入序列分成两个长度为 n/2 的子序列；
* 对这两个子序列分别采用归并排序；
* 将两个排序好的子序列合并成一个最终的排序序列。
#### 2. 动图演示
![](https://images2017.cnblogs.com/blog/849589/201710/849589-20171015230557043-37375010.gif)
#### 3. 代码实现
[代码](MergeSort.java)
