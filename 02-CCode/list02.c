/* 线性表的顺序存储结构*/
# define MAXSIZE 20   /*存储空间初始分配量*/
typedef int ElemType; /*ElemType 类型根据实际情况而定，这里假设为int */
typedef struct 
{
    ElemType data[MAXSIZE]; /*数组存储数据元素，最大值为MAXSIZE*/
    int length;  /*线性表当前长度--元素的个数*/
}SqList;