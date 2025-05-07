package com.pluralsight;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    public class EmployeeTest {

        private Employee employee;

        @BeforeEach
        public void setup() {
            employee = new Employee(); // assumes a default constructor
        }

        @Test
        public void testPunchIn() {
            employee.punchIn(8.0);
            assertEquals(8.0, employee.getPunchInTime());
        }

        @Test
        public void testPunchOutCalculatesTimeWorked() {
            employee.punchIn(8.0);
            employee.punchOut(17.0);
            assertEquals(9.0, employee.getHoursWorked(), 0.001);
        }


    }