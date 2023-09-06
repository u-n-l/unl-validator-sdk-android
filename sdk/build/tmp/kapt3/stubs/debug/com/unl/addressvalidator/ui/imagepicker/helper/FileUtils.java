package com.unl.addressvalidator.ui.imagepicker.helper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\b\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010#\u001a\u00020$J\u0018\u0010%\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010\u0004J\u001a\u0010)\u001a\u0004\u0018\u00010\u00102\b\u0010*\u001a\u0004\u0018\u00010\u00042\u0006\u0010+\u001a\u00020\u0010J9\u0010,\u001a\u0004\u0018\u00010\u00042\u0006\u0010&\u001a\u00020\'2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u00010\u00042\u000e\u00100\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u000101\u00a2\u0006\u0002\u00102J\u000e\u00103\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\'J\u0012\u00104\u001a\u0004\u0018\u00010\u00042\b\u0010-\u001a\u0004\u0018\u00010\u0004J\u001a\u00105\u001a\u0004\u0018\u00010\u00102\u0006\u0010&\u001a\u00020\'2\b\u0010-\u001a\u0004\u0018\u00010.J\u0018\u00106\u001a\u0004\u0018\u00010\u00042\u0006\u0010&\u001a\u00020\'2\u0006\u0010-\u001a\u00020.J\u0018\u00107\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.2\u0006\u0010&\u001a\u00020\'H\u0002J\u001a\u00108\u001a\u0004\u0018\u00010\u00042\u0006\u0010&\u001a\u00020\'2\u0006\u0010-\u001a\u00020.H\u0002J\u0018\u00109\u001a\u0004\u0018\u00010\u00042\u0006\u0010&\u001a\u00020\'2\u0006\u0010-\u001a\u00020.J\u0018\u00109\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\'2\b\u0010:\u001a\u0004\u0018\u00010\u0004J\u0010\u00109\u001a\u0004\u0018\u00010\u00042\u0006\u0010;\u001a\u00020\u0010J\u0012\u0010<\u001a\u0004\u0018\u00010\u00042\b\u0010=\u001a\u0004\u0018\u00010\u0004J\u0016\u0010>\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\'2\u0006\u0010-\u001a\u00020.J\u0012\u0010?\u001a\u0004\u0018\u00010\u00102\b\u0010;\u001a\u0004\u0018\u00010\u0010J\u000e\u0010@\u001a\u00020\u00042\u0006\u0010A\u001a\u00020BJ\u0012\u0010C\u001a\u0004\u0018\u00010.2\b\u0010;\u001a\u0004\u0018\u00010\u0010J\u0018\u0010D\u001a\u00020$2\b\u0010&\u001a\u0004\u0018\u00010\'2\u0006\u0010;\u001a\u00020\u0010J\u000e\u0010E\u001a\u00020\b2\u0006\u0010-\u001a\u00020.J\u000e\u0010F\u001a\u00020\b2\u0006\u0010-\u001a\u00020.J\u000e\u0010G\u001a\u00020\b2\u0006\u0010-\u001a\u00020.J\u000e\u0010H\u001a\u00020\b2\u0006\u0010-\u001a\u00020.J\u0010\u0010I\u001a\u00020\b2\b\u0010:\u001a\u0004\u0018\u00010\u0004J\u000e\u0010J\u001a\u00020\b2\u0006\u0010-\u001a\u00020.J\u000e\u0010K\u001a\u00020\b2\u0006\u0010-\u001a\u00020.J\u000e\u0010L\u001a\u00020\b2\u0006\u0010-\u001a\u00020.J\u0010\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020\u0010H\u0002J\u0012\u0010P\u001a\u0004\u0018\u00010Q2\b\u0010R\u001a\u0004\u0018\u00010\u0004J\"\u0010S\u001a\u00020N2\u0006\u0010&\u001a\u00020\'2\u0006\u0010-\u001a\u00020.2\b\u0010T\u001a\u0004\u0018\u00010\u0004H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R(\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00100\u00100\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001f\u00a8\u0006U"}, d2 = {"Lcom/unl/addressvalidator/ui/imagepicker/helper/FileUtils;", "", "()V", "AUTHORITY", "", "getAUTHORITY", "()Ljava/lang/String;", "DEBUG", "", "DOCUMENTS_DIR", "getDOCUMENTS_DIR", "HIDDEN_PREFIX", "getHIDDEN_PREFIX", "TAG", "getTAG", "downloadsDir", "Ljava/io/File;", "getDownloadsDir", "()Ljava/io/File;", "sComparator", "Ljava/util/Comparator;", "kotlin.jvm.PlatformType", "getSComparator", "()Ljava/util/Comparator;", "setSComparator", "(Ljava/util/Comparator;)V", "sDirFilter", "Ljava/io/FileFilter;", "getSDirFilter", "()Ljava/io/FileFilter;", "setSDirFilter", "(Ljava/io/FileFilter;)V", "sFileFilter", "getSFileFilter", "setSFileFilter", "createGetContentIntent", "Landroid/content/Intent;", "createTempImageFile", "context", "Landroid/content/Context;", "fileName", "generateFileName", "name", "directory", "getDataColumn", "uri", "Landroid/net/Uri;", "selection", "selectionArgs", "", "(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;", "getDocumentCacheDir", "getExtension", "getFile", "getFileName", "getGoogleDriveFilePath", "getLocalPath", "getMimeType", "url", "file", "getName", "filename", "getPath", "getPathWithoutFilename", "getReadableFileSize", "size", "", "getUri", "getViewIntent", "isDownloadsDocument", "isExternalStorageDocument", "isGoogleDriveUri", "isGooglePhotosUri", "isLocal", "isLocalStorageDocument", "isMediaDocument", "isMediaUri", "logDir", "", "dir", "readBytesFromFile", "", "filePath", "saveFileFromUri", "destinationPath", "sdk_debug"})
public final class FileUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.unl.addressvalidator.ui.imagepicker.helper.FileUtils INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String DOCUMENTS_DIR = "documents";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String AUTHORITY = "YOUR_AUTHORITY.provider";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String HIDDEN_PREFIX = ".";
    
    /**
     * TAG for log messages.
     */
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "FileUtils";
    private static final boolean DEBUG = false;
    
    /**
     * File and folder comparator. TODO Expose sorting option method
     */
    @org.jetbrains.annotations.NotNull()
    private static java.util.Comparator<java.io.File> sComparator;
    
    /**
     * File (not directories) filter.
     */
    @org.jetbrains.annotations.NotNull()
    private static java.io.FileFilter sFileFilter;
    
    /**
     * Folder (directories) filter.
     */
    @org.jetbrains.annotations.NotNull()
    private static java.io.FileFilter sDirFilter;
    
    private FileUtils() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDOCUMENTS_DIR() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAUTHORITY() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHIDDEN_PREFIX() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Comparator<java.io.File> getSComparator() {
        return null;
    }
    
    public final void setSComparator(@org.jetbrains.annotations.NotNull()
    java.util.Comparator<java.io.File> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.io.FileFilter getSFileFilter() {
        return null;
    }
    
    public final void setSFileFilter(@org.jetbrains.annotations.NotNull()
    java.io.FileFilter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.io.FileFilter getSDirFilter() {
        return null;
    }
    
    public final void setSDirFilter(@org.jetbrains.annotations.NotNull()
    java.io.FileFilter p0) {
    }
    
    /**
     * Gets the extension of a file name, like ".png" or ".jpg".
     *
     * @param uri
     * @return Extension including the dot("."); "" if there is no extension;
     * null if uri was null.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getExtension(@org.jetbrains.annotations.Nullable()
    java.lang.String uri) {
        return null;
    }
    
    /**
     * @return Whether the URI is a local one.
     */
    public final boolean isLocal(@org.jetbrains.annotations.Nullable()
    java.lang.String url) {
        return false;
    }
    
    /**
     * @return True if Uri is a MediaStore Uri.
     * @author paulburke
     */
    public final boolean isMediaUri(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
        return false;
    }
    
    /**
     * Convert File into Uri.
     *
     * @param file
     * @return uri
     */
    @org.jetbrains.annotations.Nullable()
    public final android.net.Uri getUri(@org.jetbrains.annotations.Nullable()
    java.io.File file) {
        return null;
    }
    
    /**
     * Returns the path only (without file name).
     *
     * @param file
     * @return
     */
    @org.jetbrains.annotations.Nullable()
    public final java.io.File getPathWithoutFilename(@org.jetbrains.annotations.Nullable()
    java.io.File file) {
        return null;
    }
    
    /**
     * @return The MIME type for the given file.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMimeType(@org.jetbrains.annotations.NotNull()
    java.io.File file) {
        return null;
    }
    
    /**
     * @return The MIME type for the give Uri.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMimeType(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
        return null;
    }
    
    /**
     * @return The MIME type for the give String Uri.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMimeType(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String url) {
        return null;
    }
    
    /**
     * @param uri The Uri to check.
     * @return Whether the Uri authority is local.
     */
    public final boolean isLocalStorageDocument(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
        return false;
    }
    
    /**
     * @param uri The Uri to check.
     * @return Whether the Uri authority is ExternalStorageProvider.
     */
    public final boolean isExternalStorageDocument(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
        return false;
    }
    
    /**
     * @param uri The Uri to check.
     * @return Whether the Uri authority is DownloadsProvider.
     */
    public final boolean isDownloadsDocument(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
        return false;
    }
    
    /**
     * @param uri The Uri to check.
     * @return Whether the Uri authority is MediaProvider.
     */
    public final boolean isMediaDocument(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
        return false;
    }
    
    /**
     * @param uri The Uri to check.
     * @return Whether the Uri authority is Google Photos.
     */
    public final boolean isGooglePhotosUri(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
        return false;
    }
    
    public final boolean isGoogleDriveUri(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
        return false;
    }
    
    /**
     * Get the value of the data column for this Uri. This is useful for
     * MediaStore Uris, and other file-based ContentProviders.
     *
     * @param context       The context.
     * @param uri           The Uri to query.
     * @param selection     (Optional) Filter used in the query.
     * @param selectionArgs (Optional) Selection arguments used in the query.
     * @return The value of the _data column, which is typically a file path.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDataColumn(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.net.Uri uri, @org.jetbrains.annotations.Nullable()
    java.lang.String selection, @org.jetbrains.annotations.Nullable()
    java.lang.String[] selectionArgs) {
        return null;
    }
    
    /**
     * Get a file path from a Uri. This will get the the path for Storage Access
     * Framework Documents, as well as the _data field for the MediaStore and
     * other file-based ContentProviders.<br></br>
     * <br></br>
     * Callers should check whether the path is local before assuming it
     * represents a local file.
     *
     * @param context The context.
     * @param uri     The Uri to query.
     * @see .isLocal
     * @see .getFile
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPath(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
        return null;
    }
    
    private final java.lang.String getLocalPath(android.content.Context context, android.net.Uri uri) {
        return null;
    }
    
    /**
     * Convert Uri into File, if possible.
     *
     * @return file A local file that the Uri was pointing to, or null if the
     * Uri is unsupported or pointed to a remote resource.
     * @author paulburke
     * @see .getPath
     */
    @org.jetbrains.annotations.Nullable()
    public final java.io.File getFile(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.net.Uri uri) {
        return null;
    }
    
    /**
     * Get the file size in a human-readable string.
     *
     * @param size
     * @return
     * @author paulburke
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getReadableFileSize(int size) {
        return null;
    }
    
    /**
     * Get the Intent for selecting content to be used in an Intent Chooser.
     *
     * @return The intent for opening a file with Intent.createChooser()
     */
    @org.jetbrains.annotations.NotNull()
    public final android.content.Intent createGetContentIntent() {
        return null;
    }
    
    /**
     * Creates View intent for given file
     *
     * @param file
     * @return The intent for viewing file
     */
    @org.jetbrains.annotations.NotNull()
    public final android.content.Intent getViewIntent(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.io.File file) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.io.File getDownloadsDir() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.io.File getDocumentCacheDir(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    private final void logDir(java.io.File dir) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.io.File generateFileName(@org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.io.File directory) {
        return null;
    }
    
    private final void saveFileFromUri(android.content.Context context, android.net.Uri uri, java.lang.String destinationPath) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final byte[] readBytesFromFile(@org.jetbrains.annotations.Nullable()
    java.lang.String filePath) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    public final java.io.File createTempImageFile(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String fileName) throws java.io.IOException {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFileName(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName(@org.jetbrains.annotations.Nullable()
    java.lang.String filename) {
        return null;
    }
    
    private final java.lang.String getGoogleDriveFilePath(android.net.Uri uri, android.content.Context context) {
        return null;
    }
}