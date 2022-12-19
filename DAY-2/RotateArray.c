void swap(int *a,int *b){
    int t = *a;
    *a = *b;
    *b = t;
}
void rev(int *a,int s ,int e){
    while(s<e)
        swap(&a[s++],&a[e--]);
}
void rotate(int* nums, int numsSize, int k){
    k = k%numsSize;
    rev(nums,0,numsSize-k-1);
    rev(nums,numsSize-k,numsSize-1);
    rev(nums,0,numsSize-1);

}
