package com.practice.testing.section2;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//@DisplayNameGeneration(DisplayNameGenerator.Simple.class)
@Slf4j
public class DemoUtilsTest {

    private DemoUtils demoUtils;

    @BeforeEach
    void setup() {
        this.demoUtils = new DemoUtils();
    }

    @Test
    @DisplayName("Equals and Not Equals")
    void testEqualsAndNotEquals() {
        // execute and assert (by junit and assertj)
        assertEquals(6, demoUtils.add(2, 4), "2+4 must be 6");
        assertNotEquals(8, demoUtils.add(1, 9), "1+9 must not be 8");

//        junit의 assertions보다는 assertj의 assertions를 쓰는걸 권장 (체이닝, 부가기능 등 지원되는게 더 많고 다양함)
//        assertThat(demoUtils.add(2, 4))
//                .withFailMessage("2+4 must be 6")
//                .isEqualTo(6);
//        assertThat(demoUtils.add(1, 9))
//                .withFailMessage("1+9 must not be 8")
//                .isNotEqualTo(8);
    }

    @Test
    @DisplayName("Null and Not Null")
    void testNullAndNotNull() {
        // set up
        String str1 = null;
        String str2 = "luv2code";

        assertNull(demoUtils.checkNull(str1), "Object should be null");
        assertNotNull(demoUtils.checkNull(str2), "Object should not be null");

//        assertThat(demoUtils.checkNull(str1))
//                .withFailMessage("Object should be null")
//                .isNull();
//        assertThat(demoUtils.add(1, 9))
//                .withFailMessage("Object should not be null")
//                .isNotNull();
    }

    /*
    @AfterEach
    void teardown() {
        log.info("Running @AfterEach\n");
    }

    @BeforeAll
    static void setupBeforeAll() {
        log.info("@BeforeAll executes only once before all test execution");
    }

    @AfterAll
    static void teardownAfterAll() {
        log.info("@AfterAll executes only once after all test execution ");
    }
    */
}
