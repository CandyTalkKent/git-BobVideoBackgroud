package cn.bobvideo.mapper;

import java.util.List;

import cn.bobvideo.pojo.VideoItem;

public interface VideoItemMapper {
	Long insertVideoItem(VideoItem videoItem);
	void updateVideoItem(VideoItem videoItem);
	List<VideoItem> selectVideoItems();
}
