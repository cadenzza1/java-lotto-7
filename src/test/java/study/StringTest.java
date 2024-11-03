package study;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringTest {

    @DisplayName("'1,2'를 ,(콤마)를 기준으로 split한 배열이 1과 2로 구성되어 있는지 테스트")
    @Test
    public void contains_test_1(){
        List<String> testStringList = new ArrayList<>(List.of("1,2".split(",")));

        assertThat(testStringList).contains("1","2");
    }

    @DisplayName("'1'을 ,(콤마)를 기준으로 split한 배열이 오직 1로만 구성되어 있는지 테스트")
    @Test
    public void contains_test_2(){
        assertThat("1".split(",")).containsExactly("1");
    }

    @DisplayName("'1,2,3'을 ,(콤마)를 기준으로 split한 배열에 4는 포함되어 있지 않음을 테스트")
    @Test
    public void contains_test_3(){
        assertThat("1,2,3".split(",")).doesNotContain("4");
    }
}