package kr.or.erp.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonFormat;

@ToString
@Getter
@Setter
public class FormSearch {
	private String staff_name, department_name, 
					start_year, start_month, start_day, end_year, end_month, end_day,
					isAllStaffList, keyword_type, keyword,
					//필요여부 확인할것
					no_btn, name_btn, gender_btn, dept_btn, graduate_btn;
	private List<String> staff_gender_list, school_list, skill_list;
	private int page_no;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private String start_date, end_date;
}
