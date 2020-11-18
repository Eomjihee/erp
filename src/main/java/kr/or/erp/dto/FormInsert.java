package kr.or.erp.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class FormInsert {
	private int staff_no, jumin_first, jumin_second, department_code, school_code;
	private int[] skill_code_list;
	private String start_year, start_month, start_day, end_year, end_month, end_day;
}
