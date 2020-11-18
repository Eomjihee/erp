package kr.or.erp.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class StaffDto {
	private int row_num,staff_no;
	private String staff_name, jumin_no, staff_gender;
	private CodeSchoolDto codeSchoolDto;
	private CodeDepartmentDto codeDepartmentDto;
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	private Date graduateDay;
}
