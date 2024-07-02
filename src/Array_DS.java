public class Array_DS {

    String name[];
    int[] age = new int[]{};

    public void printData(Array_DS arr) {

        for(int i=0; i<arr.name.length;i++) {
            System.out.println(arr.name[i]+ " = "+arr.age[i]);
        }
    }


}
