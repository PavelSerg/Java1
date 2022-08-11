//Пример 1:
//Ввод: arr = [1,0,2,3,0,4,5,0]
//Вывод: [1,0,0,2,3,0,0,4]
//Объяснение: После вызова вашей функции входной массив изменяется на: [1,0,0,2,3,0,0,4]
//Пример 2:
//Ввод: arr = [1,2,3]
//Вывод: [1,2,3]
//Объяснение: После вызова вашей функции входной массив изменяется на: [1,2,3]

class Solution { 
    public void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                if (i + 1 < arr.length) {
                    System.arraycopy(arr, i, arr, i + 1, arr.length - i - 1);
                    i++;
                }
            }
        }
    }
}


public class DuplicateZeros {
    public static int[] stringToIntegerArray(String ) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return new int[0];
        }

        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for (int index = 0; index < parts.length; index++) {
            String  = parts[index].trim();
            output[index] = Integer.parseInt (part);
        }
        return output;
    }

    public static String integerArrayToString(int[] nums, int length) {
        if (length == 0) {
            return "[]";
        }

        String result = "";
        for (int index = 0; index < length; index++) {
            int number = nums[index];
            result += Integer.toString(number) + ", ";
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }

    public static String integerArrayToString(int[] nums) {
        return integerArrayToString(nums, nums.length);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] arr = stringToIntegerArray(line);

            new Solution().duplicateZeros(arr);
            String out = integerArrayToString(arr);

            System.out.print(out + "\n");
            break;
        }
    }
}