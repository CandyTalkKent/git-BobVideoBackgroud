package cn.bobvideo.service;

import java.util.List;

import cn.bobvideo.pojo.VideoItem;

public interface InsertOrUpdateVideoService {

	public void insertVideoItem();
	List<VideoItem> selectVideoItems();
}
