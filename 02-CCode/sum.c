/**
 * 
 *  求和运算
 * /

//普通人做法
int i ,sum = 0, n = 100 ;
for(i=1; i< = n; i++){
    sum = sum +i ;
}
printf(" %d ",sum);




// 高斯做法
int i, sum = 0,n =100;
sum = (1+n) * n /2 ;
printf("%d",sum) 