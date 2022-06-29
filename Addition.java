class Addition{
	public static void main(String args[]){
		Addition a=new Addition();
		int sum=a.add(3,5,6,8,9);
		System.out.print(sum);
}
	public int add(int a,int b){
	 	return a+b;
	}
	/*public int add(int a,int b,int c){
	 	return a+b+c;
	}*/
	public int add(int...a){
	 	int sum=0;
	for(int i=0;i<a.length;i++){
		sum=sum+a[i];
	}
	return sum;
	}
}