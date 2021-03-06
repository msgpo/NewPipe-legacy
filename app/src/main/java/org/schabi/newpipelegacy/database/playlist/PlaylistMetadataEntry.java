package org.schabi.newpipelegacy.database.playlist;

import androidx.room.ColumnInfo;

import static org.schabi.newpipelegacy.database.playlist.model.PlaylistEntity.PLAYLIST_ID;
import static org.schabi.newpipelegacy.database.playlist.model.PlaylistEntity.PLAYLIST_NAME;
import static org.schabi.newpipelegacy.database.playlist.model.PlaylistEntity.PLAYLIST_THUMBNAIL_URL;

public class PlaylistMetadataEntry implements PlaylistLocalItem {
    final public static String PLAYLIST_STREAM_COUNT = "streamCount";

    @ColumnInfo(name = PLAYLIST_ID)
    final public long uid;
    @ColumnInfo(name = PLAYLIST_NAME)
    final public String name;
    @ColumnInfo(name = PLAYLIST_THUMBNAIL_URL)
    final public String thumbnailUrl;
    @ColumnInfo(name = PLAYLIST_STREAM_COUNT)
    final public long streamCount;

    public PlaylistMetadataEntry(long uid, String name, String thumbnailUrl, long streamCount) {
        this.uid = uid;
        this.name = name;
        this.thumbnailUrl = thumbnailUrl;
        this.streamCount = streamCount;
    }

    @Override
    public LocalItemType getLocalItemType() {
        return LocalItemType.PLAYLIST_LOCAL_ITEM;
    }

    @Override
    public String getOrderingName() {
        return name;
    }
}
