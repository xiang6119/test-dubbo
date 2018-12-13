package vc.thinker.dubbo.server.impl;

import org.springframework.transaction.annotation.Transactional;

import com.alibaba.dubbo.config.annotation.Service;

import vc.thinker.dubbo.service.LockService;

/**
 * 
 * @author ZhangGaoXiang
 * @date   2018年12月13日 下午4:30:13
 */
@Service(timeout=5000)
@Transactional(rollbackFor = Exception.class)
public class LockServiceImpl implements LockService{

	@Override
	public String findOne(Long id) {
		return "查询一个:" + id;
	}

	@Override
	public String listByType(Integer type) {
		return "查询列表:" + type;
	}

	@Override
	public Boolean delete(Long id) {
		return true;
	}
}
