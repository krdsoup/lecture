package dsoup.reservation.lecture.employee.reservation.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import dsoup.reservation.lecture.employee.reservation.vo.EmpLectureRegistrationReqVo;
import dsoup.reservation.lecture.employee.reservation.vo.EmpLectureRegistrationVo;
import dsoup.reservation.lecture.employee.reservation.vo.EmpLectureReqVo;
import dsoup.reservation.lecture.employee.reservation.vo.EmpLectureVo;
import dsoup.reservation.lecture.vo.PagingVo;

@Repository
@Mapper
public interface EmpLectureReservationMapper {

	List<EmpLectureVo> selectLectureList(EmpLectureReqVo req);

	int selectLectureListCount(EmpLectureReqVo req);
	
	int selectLectureReservationYn(EmpLectureRegistrationReqVo req);

	int insertLectureReservation(EmpLectureRegistrationReqVo req);

	List<EmpLectureRegistrationVo> selectLectureReservationList(EmpLectureRegistrationReqVo req);

	int selectLectureReservationListCount(EmpLectureRegistrationReqVo req);

	int cancelLectureReservation(EmpLectureRegistrationReqVo req);

	List<EmpLectureVo> selectPopularLectureList(PagingVo req);

	int selectPopularLectureListCount(PagingVo req);

}
