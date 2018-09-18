### 希尔排序
希尔排序（Shell Sort）是把记录按下标的一定增量分组，对每组使用直接插入排序算法排序；随着增量逐渐减少，每组包含的关键词越来越多，当增量减至1时，整个序列恰被分成一组，算法便终止。
#### 1. 算法描述
先将整个待排序的记录序列分割成为若干子序列分别进行直接插入排序，具体算法描述：

* 选择一个增量序列 t1，t2，…，tk，其中 ti>tj，tk=1；
* 按增量序列个数 k，对序列进行 k 趟排序；
* 每趟排序，根据对应的增量 ti，将待排序列分割成若干长度为 m 的子序列，分别对各子表进行直接插入排序。仅增量因子为1时，整个序列作为一个表来处理，表长度即为整个序列的长度。
#### 2. 动图演示
![](https://images2018.cnblogs.com/blog/849589/201803/849589-20180331170017421-364506073.gif)
#### 3. 理解过程
希尔排序基本步骤，先选择增量 gap=arr.length/2，后续增量变化为 gap/=2，这样选取的增量可以采用一个序列来表示 {n/2, (n/2)/2, ..., 1}，增量序列的选择多种多样，这样的选择方式比较常用。
![](https://images2015.cnblogs.com/blog/1024555/201611/1024555-20161128110416068-1421707828.png)
#### 4. 代码实现
[代码](ShellSort.java)