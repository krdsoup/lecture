package dsoup.reservation.lecture.manager.reservation.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import dsoup.reservation.lecture.manager.reservation.vo.MngLectureRegistrationReqVo;
import dsoup.reservation.lecture.manager.reservation.vo.MngLectureRegistrationVo;
import dsoup.reservation.lecture.manager.reservation.vo.MngLectureReqVo;
import dsoup.reservation.lecture.manager.reservation.vo.MngLectureVo;

@Repository
@Mapper
public interface MngLectureReservationMapper {

	List<MngLectureVo> selectLectureList(MngLectureReqVo req);

	int selectLectureListCount(MngLectureReqVo req);
	
	int insertLecture(MngLectureVo req);

	List<MngLectureRegistrationVo> selectLectureReservationList(MngLectureRegistrationReqVo req);

	int selectLectureReservationListCount(MngLectureRegistrationReqVo req);

}
