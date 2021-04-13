package com.happy.gym.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.happy.gym.dao.ToolDao;
import com.happy.gym.manager.result.R;
import com.happy.gym.manager.result.Status;
import com.happy.gym.model.vo.ToolAddVo;
import com.happy.gym.model.vo.ToolListVo;
import com.happy.gym.service.ToolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ToolServiceImpl implements ToolService {

    @Autowired
    private ToolDao toolDao;

    @Override
    public R listTool(Integer page, Integer limit) {
        Page<ToolListVo> pg = PageHelper.startPage(page,limit);
        List<ToolListVo> tools = toolDao.listTool();
        return R.Success((int)pg.getTotal(), tools);
    }

    @Override
    public R modToolStatus(Integer id) {
        Integer res = toolDao.modToolStatus(id);
        if (res != null && res == 1)
            return R.Success();
        else return R.Warn(Status.DB_OPERATE_FAILED);
    }

    @Override
    public R findToolDetail(Integer id) {
        ToolListVo toolDetail = toolDao.findToolDetail(id);
        if (toolDetail == null) {
            return R.Error(Status.ARGS_NOT_ALLOW_NULL);
        }
        return R.Success(toolDetail);
    }

    @Override
    public R delTool(Integer id) {
//        ToolListVo toolDetail = toolDao.findToolDetail(id);
//        if (toolDetail == null) {
//            return R.Error(Status.ARGS_NOT_ALLOW_NULL);
//        } else if (toolDetail.getTScrap() == false) {
//            return R.Warn(Status.ARGS_NOT_MATCH_NEED);
//        }
        Integer is_del = toolDao.delTool(id);
        if (is_del == 1) {
            return R.Success();
        } else {
            return R.Error(Status.DB_OPERATE_FAILED);
        }
    }

    @Override
    @Transactional
    public R addTool(ToolAddVo toolAddVo) {
        String tType = toolAddVo.getTType();
        String tDesc = toolAddVo.getTDesc();
        Integer tShelfLife = toolAddVo.getTShelfLife();
        Integer res = toolDao.addTool(tType, tDesc, tShelfLife);
        if (res == null) {
            return R.Error(Status.DB_OPERATE_FAILED);
        }
        return R.Success();
    }
}
