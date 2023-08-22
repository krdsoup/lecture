package dsoup.reservation.lecture.employee.reservation.vo;

import dsoup.reservation.lecture.vo.PagingVo;

public class EmpLectureReqVo extends PagingVo {

	private String lecturerName;
	private String lectureTitle;
	private String lectureContents;
	private String lectureStartTime;
	private String lectureEndTime;
	private Long employeeId;

	public String getLecturerName() {
		return lecturerName;
	}

	public void setLecturerName(String lecturerName) {
		this.lecturerName = lecturerName;
	}

	public String getLectureTitle() {
		return lectureTitle;
	}

	public void setLectureTitle(String lectureTitle) {
		this.lectureTitle = lectureTitle;
	}

	public String getLectureContents() {
		return lectureContents;
	}

	public void setLectureContents(String lectureContents) {
		this.lectureContents = lectureContents;
	}

	public String getLectureStartTime() {
		return lectureStartTime;
	}

	public void setLectureStartTime(String lectureStartTime) {
		this.lectureStartTime = lectureStartTime;
	}

	public String getLectureEndTime() {
		return lectureEndTime;
	}

	public void setLectureEndTime(String lectureEndTime) {
		this.lectureEndTime = lectureEndTime;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

}
