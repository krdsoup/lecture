package dsoup.reservation.lecture.employee.reservation.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dsoup.reservation.lecture.employee.reservation.mapper.EmpLectureReservationMapper;
import dsoup.reservation.lecture.employee.reservation.vo.EmpLectureRegistrationReqVo;
import dsoup.reservation.lecture.employee.reservation.vo.EmpLectureReqVo;
import dsoup.reservation.lecture.vo.PagingVo;

/**
 * 강연 예약 직원 Service
 */
@Service
public class EmpLectureReservationService {

	@Autowired
	private EmpLectureReservationMapper mapper;

	/**
	 * 강연 목록
	 */
	public Map<String, Object> getLectureList(EmpLectureReqVo req) {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("list", mapper.selectLectureList(req));
		result.put("totalCount", mapper.selectLectureListCount(req));
		return result;
	};

	/**
	 * 강연 신청
	 */
	@Transactional
	public int registLectureReservation(EmpLectureRegistrationReqVo req) {
		return mapper.insertLectureReservation(req);
	};
	
	/**
	 * 강연 신청 여부
	 */
	public int getLectureReservationYn(EmpLectureRegistrationReqVo req) {
		return mapper.selectLectureReservationYn(req);
	};

	/**
	 * 강연 신청 목록
	 */
	public Map<String, Object> getLectureReservationList(EmpLectureRegistrationReqVo req) {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("list", mapper.selectLectureReservationList(req));
		result.put("totalCount", mapper.selectLectureReservationListCount(req));
		return result;
	};

	/**
	 * 강연 신청 취소
	 */
	@Transactional
	public int removeLectureReservation(EmpLectureRegistrationReqVo req) {
		return mapper.cancelLectureReservation(req);
	};

	/**
	 * 실시간 인기 강연
	 */
	public Map<String, Object> getPopularLectureList(PagingVo req) {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("list", mapper.selectPopularLectureList(req));
		result.put("totalCount", mapper.selectPopularLectureListCount(req));
		return result;
	};
}
