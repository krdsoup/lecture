package dsoup.reservation.lecture.manager.reservation.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dsoup.reservation.lecture.manager.reservation.mapper.MngLectureReservationMapper;
import dsoup.reservation.lecture.manager.reservation.vo.MngLectureRegistrationReqVo;
import dsoup.reservation.lecture.manager.reservation.vo.MngLectureReqVo;
import dsoup.reservation.lecture.manager.reservation.vo.MngLectureVo;

/**
 * 강연 예약 직원 Service
 */
@Service
public class MngLectureReservationService {

	@Autowired
	private MngLectureReservationMapper mapper;

	/**
	 * 강연 목록
	 */
	public Map<String, Object> getLectureList(MngLectureReqVo req) {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("list", mapper.selectLectureList(req));
		result.put("totalCount", mapper.selectLectureListCount(req));
		return result;
	};

	/**
	 * 강연 등록
	 */
	@Transactional
	public int registLecture(MngLectureVo req) {
		return mapper.insertLecture(req);
	};
	
	/**
	 * 강연 신청자 목록
	 */
	public Map<String, Object> getLectureReservationList(MngLectureRegistrationReqVo req) {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("list", mapper.selectLectureReservationList(req));
		result.put("totalCount", mapper.selectLectureReservationListCount(req));
		return result;
	};

}
