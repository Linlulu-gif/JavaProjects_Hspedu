public class BubbleSort {
    public static void main(String[] args) {
//        System.out.println();//快捷键 sout，自动补全
        MyTools tools = new MyTools();
        int arrp[] = {102,26,18,29,-1,-9,23,88,36,17};

        System.out.println("原数组中各个元素如下：");
        for(int i = 0; i < arrp.length; i++){
            System.out.print(arrp[i] + "\t");
        }
        System.out.println("------------------------------------------------------------------");
        tools.bubbleSort(arrp);
    }
}

//定义一个MyTools类，包含方法bubbleSort，对一个数组int 进行从小到大排序
class MyTools{

    public void bubbleSort(int[] arr){
        //对arr进行从小到大排序
        int temp = 0;//用作交换使用
        //再考虑代码的健壮性
        /*
        * 1.原数组有序，需记录交换次数，1次未换，则退出排序，已经有序；
        * 2.考虑数组为null 或 {} 或 就一个元素
        */
//        if(arr.length == 1){
//            System.out.println("数组中就一个元素，如下：");
//            for (int k = 0; k < arr.length; k++) {
//                System.out.print(arr[k] + "\t");
//            }
//        } else if(arr == null || arr.length == 0){
//            System.out.println("数组大小有异常，至少应为大于等于1的值！！！");
//        } else {
        int swapNum = 0;
        for(int i = 0; i < arr.length - 1; i++) {//排序趟数 n - 1 趟
            swapNum = 0;//重新置零
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {//前一项大于后一项，则交换
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swapNum++;
                }
            }
            if (swapNum == 0) {
                System.out.println();
                System.out.println("数组已经是有序的，排序后的结果是：");
                for (int k = 0; k < arr.length; k++) {
                    System.out.print(arr[k] + "\t");
                }
                break;//有序则跳出
            }
            System.out.println("\n" + "第" + (i + 1) + "次排序后，数组的元素是：");
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + "\t");
            }
        }
    }
}
