package com.aleh.struneuski.background.database.dao;

import com.aleh.struneuski.background.bean.soundclound.Track;

import java.util.List;

/**
 * Created by alehstruneuski on 5/1/17.
 */
public interface TrackDao {

    List<Track> getTracksFromDataBase();

    boolean insertRecord(Track record, String soundFilePath, String imageFilePath);

    boolean updateSoundDataByStreamUrl(String streamUrl, String streamFilePath, long idStreamFilePath);

    boolean updateImageDataByStreamUrl(String streamUrl, String imageFilePath, long idImageFilePath);

    Track getRecordByTitle(String title);

    boolean removeRecordByTitle(String title);

    boolean containRecordByTitle(String title);

    void tagDowloadedTracks(List<Track> items);

}
