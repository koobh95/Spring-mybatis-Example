package com.tistory.ku_develog.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tistory.ku_develog.dto.MemberDTO;
import com.tistory.ku_develog.service.MemberService;

@RestController
public class MemberController { 
	@Resource(name = "memberService")
	private MemberService memberService;
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@RequestMapping(value="/getAll", method = RequestMethod.GET)
	public List<MemberDTO> getAll() {
		logger.info("[Request/getAll]");
		return memberService.getAll();
	}
	
	@RequestMapping(value="/getMember", method = RequestMethod.GET)
	public MemberDTO getMember(@RequestParam(value = "id") String id) {
		logger.info("[Request/getMember] {id=" + id + "}");
		return memberService.getMember(id);
	}
	
	@RequestMapping(value="/insertMember", method=RequestMethod.GET)
	public void addMember(MemberDTO memberDto) {
		logger.info("[Request/insertMember] " + memberDto);
		if(!memberService.insertMember(memberDto))
			logger.error("insert error " + memberDto);
	}
	
	@RequestMapping(value="/deleteMember", method=RequestMethod.GET)
	public void deleteMember(String id) {
		logger.info("[Request/deleteMember] {id=" + id + "}");
		 if(!memberService.deleteMember(id))
			 logger.error("delete error. {id=" + id + "}");
	}
	
	@RequestMapping(value="/updateMember", method=RequestMethod.GET)
	public void updateMember(MemberDTO memberDto) {
		logger.info("[Request/updateMember]");
		if(memberService.updateMember(memberDto) == null)
			logger.error("update error " + memberDto);
	}
}
