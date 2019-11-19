package arraylistQ3_2;

import java.util.Arrays;

public class ArrayListNameCards {
    private String[] name = new String[30];
    private String[] phoneNumber = new String[30];
    private int size = 0;
    private int index;


    public void add(String insertName, String insertPhoneNumber) {
        name[size] = insertName;
        phoneNumber[size] = insertPhoneNumber;
        size++;
    }

    public int indexOf(String findName) {
        if (findName == null) {
            for (int i = 0; i < size; i++) {
                if (name[i] == null) {
                    return -1;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (findName.equals(name[i]))
                    return i;
            }
        }
        return -1;

    }

    public String printPhoneInfo(int index) {
        if (index == -1) {
            return "해당 이름을 가진 사람이 없습니다.";
        }
        return name[index] + "의 전화번호는 " + phoneNumber[index] + "입니다.";
    }


    public String changePhoneInfo(int index, String changePhoneNumber) {
        phoneNumber[index] = changePhoneNumber;
        return name[index] + "의 전화번호를 " + phoneNumber[index] + "로 변경합니다.";
    }

    public String remove(int index) {
        //String removedPhone = phoneNumber[index];
        //String removedName = name[index];
        for (int i = index; i <= size - 1; i++) {

            phoneNumber[i - 1] = phoneNumber[i];
            name[i - 1] = name[i];
        }
        size--;
        return name[index] + "의 정보를 삭제하였습니다.";
    }

    public String toString() {
        String strs = "[ ";
        for (int i = 0; i < size; i++) {
            strs += name[i] + " : " + phoneNumber[i];
            if (i < size - 1) {
                strs += " , ";
            }
        }
        return strs + " ]";
    }

}
