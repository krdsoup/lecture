package dsoup.reservation.lecture.manager.reservation.vo;

import dsoup.reservation.lecture.vo.PagingVo;

public class MngLectureRegistrationReqVo extends PagingVo {

	private Long lectureRegistrationId;
	private Long employeeId;
	private String employeeNumber;

	public Long getLectureRegistrationId() {
		return lectureRegistrationId;
	}

	public void setLectureRegistrationId(Long lectureRegistrationId) {
		this.lectureRegistrationId = lectureRegistrationId;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

}
