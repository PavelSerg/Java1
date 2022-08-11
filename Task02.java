//Пример 1:
//Ввод: nums = [3,2,2,3], значение = 3
//Вывод: 2, nums = [2,2,_,_]
//Объяснение: ваша функция должна возвращать k = 2, причем первые два элемента nums равны 2.
//Не имеет значения, что вы оставляете за пределами возвращаемого k (следовательно, они являются символами подчеркивания).
//Пример 2:
//Входные данные: nums = [0,1,2,2,3,0,4,2], значение = 2
//Вывод: 5, числа = [0,1,4,0,3,_,_,_]
//Объяснение: ваша функция должна возвращать k = 5, причем первые пять элементов nums содержат 0, 0, 1, 3 и 4.
//Обратите внимание, что пять элементов могут быть возвращены в любом порядке.
//Не имеет значения, что вы оставляете за пределами возвращаемого k (следовательно, они являются символами подчеркивания).

public class  {
    public static int removeElement(int[] nums, int val) {
		if (nums == null || nums.length == 0) {
			0 0;
		}
		int newLength = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums [i]!= val) {
				nums [newLength] = nums [i];
				newLength++;
			}
		}
		return newLength;
	}

}




public class  {
    public static int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            0 0;
        }

        int preIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums [i]!= val) {
                nums [preIndex++] = nums[i];
            }
        }
        return preIndex;
    }

    public static void main (String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        System.out.println(removeElement(nums, val));
    }
}