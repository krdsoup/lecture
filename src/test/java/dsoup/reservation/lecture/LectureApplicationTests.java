package dsoup.reservation.lecture;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import dsoup.reservation.lecture.employee.reservation.mapper.EmpLectureReservationMapper;
import dsoup.reservation.lecture.manager.reservation.mapper.MngLectureReservationMapper;
import dsoup.reservation.lecture.manager.reservation.vo.MngLectureVo;

@SpringBootTest
class LectureApplicationMapperTests {
	
	@Autowired
	private MngLectureReservationMapper mngLectureReservationMapper;
	
	@Autowired
	private EmpLectureReservationMapper empLectureReservationMapper;
	
	@Test
	public void MngLectureReservationMapperTest() {
		
		MngLectureVo mngLectureVo = new MngLectureVo();
		mngLectureVo.setLectureHallId(1L);
		mngLectureVo.setLecturerName("김용국");
		mngLectureVo.setLectureTitle("Java 설명회");
		mngLectureVo.setLectureContents("1.Java의 정의\n2.Java의 역사\n3.Java의 구성");
		mngLectureVo.setLectureStartTime("2023-08-26 11:00:00");
		mngLectureVo.setLectureEndTime("2023-08-26 12:00:00");
		mngLectureVo.setLectureSeatsMax(50);
		
		Assert.notNull(mngLectureReservationMapper.insertLecture(mngLectureVo), "등록성공");
		Assert.isTrue(mngLectureReservationMapper.insertLecture(mngLectureVo) == 0, "등록실패");
		
	}

	@Test
	void contextLoads() {
	}

}
