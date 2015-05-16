package eu.crushedpixel.replaymod.api.client.pagination;

import eu.crushedpixel.replaymod.api.client.holders.FileInfo;

import java.util.List;

public interface Pagination {
    public List<FileInfo> getFiles();

    public int getLoadedPages();

    public boolean fetchPage();

    public static final int PAGE_SIZE = 30; //defined by the Website API
}
