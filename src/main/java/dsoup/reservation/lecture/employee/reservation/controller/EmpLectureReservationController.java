package dsoup.reservation.lecture.employee.reservation.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dsoup.reservation.lecture.config.Response;
import dsoup.reservation.lecture.config.ResponseCode;
import dsoup.reservation.lecture.employee.reservation.service.EmpLectureReservationService;
import dsoup.reservation.lecture.employee.reservation.vo.EmpLectureRegistrationReqVo;
import dsoup.reservation.lecture.employee.reservation.vo.EmpLectureReqVo;
import dsoup.reservation.lecture.vo.PagingVo;

/**
 * 강연 예약 직원 API
 */
@RequestMapping("/emp/lecture")
@RestController
public class EmpLectureReservationController {

	@Autowired
	private EmpLectureReservationService service;

	/**
	 * 강연 목록
	 */
	@GetMapping("/list")
	public Response getLectureList(@RequestBody EmpLectureReqVo req) {
		
		// validate
		// header, access_token 등 인증정보를 통한 ID 확인
		req.setEmployeeId(null);
		
		// 강연 목록 조회
		Map<String, Object> data = service.getLectureList(req);
		
		return new Response(data);
	};

	/**
	 * 강연 신청
	 */
	@PostMapping("/reservation")
	public Response registLectureReservation(@RequestBody EmpLectureRegistrationReqVo req) {
		
		// validate
		// header, access_token 등 인증정보를 통한 ID 확인
		req.setEmployeeId(null);
		
		// 강연 신청 여부 조회
		int reservationYn = service.getLectureReservationYn(req);
		if(reservationYn == 1) {
			return new Response(ResponseCode.DUPLICATE_DATA);
		}
		
		// 강연 신청
		int result = service.registLectureReservation(req);
		if(result == 0) {
			return new Response(ResponseCode.BAD_REQUEST);
		}
		
		return new Response(ResponseCode.NO_ERROR);
	};

	/**
	 * 강연 신청 목록
	 */
	@GetMapping("/reservation/list")
	public Response getLectureReservationList(@RequestBody EmpLectureRegistrationReqVo req) {
		
		// validate
		// header, access_token 등 인증정보를 통한 ID 확인
		req.setEmployeeId(null);
		
		// 강연 신청 목록 조회
		Map<String, Object> data = service.getLectureReservationList(req);
		
		return new Response(data);
	};

	/**
	 * 강연 신청 취소
	 */
	@DeleteMapping("/reservation")
	public Response removeLectureReservation(@RequestBody EmpLectureRegistrationReqVo req) {
		// validate
		// header, access_token 등 인증정보를 통한 ID 확인
		req.setEmployeeId(null);
		
		// 강연 신청 여부 조회
		int reservationYn = service.getLectureReservationYn(req);
		if(reservationYn == 0) {
			return new Response(ResponseCode.NO_DATA);
		}
		
		// 강연 신청 취소
		int result = service.removeLectureReservation(req);
		if(result == 0) {
			return new Response(ResponseCode.BAD_REQUEST);
		}
		
		return new Response(ResponseCode.NO_ERROR);
	};

	/**
	 * 실시간 인기 강연
	 */
	@GetMapping("/popular")
	public Response getPopularLectureList(@RequestBody PagingVo req) {
		// validate
		
		// 강연 신청 목록 조회
		Map<String, Object> data = service.getPopularLectureList(req);
		
		return new Response(data);
	};
}
