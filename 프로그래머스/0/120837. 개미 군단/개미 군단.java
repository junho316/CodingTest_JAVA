class Solution {
    public int solution(int hp) {
          int answer = 0;

    int count = 0;

    while (hp > 0){

        if (hp >= 5){

            hp = hp - 5;

            count = count + 1;

        } else if (hp >= 3){

            hp = hp - 3;

            count = count + 1;

        } else if (hp >= 1){

            hp = hp - 1;

            count = count + 1;

        }

    }

    return count;
    }
}