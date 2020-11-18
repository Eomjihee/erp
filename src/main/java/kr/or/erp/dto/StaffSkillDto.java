package kr.or.erp.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class StaffSkillDto {
	private int staff_skill_no, skill_code;
	private StaffDto staffDto;
	private CodeSkillDto[] codeSkillDtoArr;
}
