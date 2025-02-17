// BEGIN GENERATED BY /Users/kueda/projects/eclipse/workspace/iNaturalist/rails2android.rb AT Mon Dec 26 19:18:32 -0500 2011
package org.inaturalist.android;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;
import android.content.ContentUris;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.provider.BaseColumns;
import android.util.Log;

public class ObservationPhoto implements BaseColumns, Serializable {
    public Integer _id;
    public Timestamp _created_at;
    public Integer _observation_id;
    public Integer _photo_id;
    public Timestamp _synced_at;
    public Timestamp _updated_at;
    public Timestamp created_at;
    public Integer id;
    public Integer observation_id;
    public Integer photo_id;
    public Integer position;
    public Timestamp updated_at;
    public String photo_url;
    public String photo_filename;
    public String original_photo_filename;
    public String uuid;
    public Boolean is_deleted;
    public Boolean is_deleted_was;

    public Timestamp _created_at_was;
    public Integer _observation_id_was;
    public Integer _photo_id_was;
    public Timestamp _synced_at_was;
    public Timestamp _updated_at_was;
    public Timestamp created_at_was;
    public Integer id_was;
    public Integer observation_id_was;
    public Integer photo_id_was;
    public Integer position_was;
    public Timestamp updated_at_was;


    public static final String TAG = "ObservationPhoto";
    public static final String TABLE_NAME = "observation_photos";
    public static final int OBSERVATION_PHOTOS_URI_CODE = 1801;
    public static final int OBSERVATION_PHOTO_ID_URI_CODE = 1686;
    public static HashMap<String, String> PROJECTION_MAP;
    public static final String AUTHORITY = "org.inaturalist.android.observation_photo";
    public static final Uri    CONTENT_URI = Uri.parse("content://" + AUTHORITY + "/observation_photos");
    public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.google.observation_photo";
    public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.google.observation_photo";
    public static final String DEFAULT_SORT_ORDER = "position ASC, id ASC, _id ASC";
    public static final String _CREATED_AT = "_created_at";
    public static final String _OBSERVATION_ID = "_observation_id";
    public static final String _PHOTO_ID = "_photo_id";
    public static final String _SYNCED_AT = "_synced_at";
    public static final String _UPDATED_AT = "_updated_at";
    public static final String CREATED_AT = "created_at";
    public static final String UUID = "uuid";
    public static final String PHOTO_URL = "photo_url";
    public static final String PHOTO_FILENAME = "photo_filename";
    public static final String ID = "id";
    public static final String OBSERVATION_ID = "observation_id";
    public static final String PHOTO_ID = "photo_id";
    public static final String POSITION = "position";
    public static final String UPDATED_AT = "updated_at";
    public static final String IS_DELETED = "is_deleted";
    public static final String ORIGINAL_PHOTO_FILENAME = "original_photo_filename";


    public static final String[] PROJECTION = new String[] {
        ObservationPhoto._ID,
        ObservationPhoto._CREATED_AT,
        ObservationPhoto._OBSERVATION_ID,
        ObservationPhoto._PHOTO_ID,
        ObservationPhoto._SYNCED_AT,
        ObservationPhoto._UPDATED_AT,
        ObservationPhoto.CREATED_AT,
        ObservationPhoto.UUID,
        ObservationPhoto.ID,
        ObservationPhoto.OBSERVATION_ID,
        ObservationPhoto.PHOTO_ID,
        ObservationPhoto.POSITION,
        ObservationPhoto.UPDATED_AT,
        ObservationPhoto.PHOTO_URL,
        ObservationPhoto.IS_DELETED,
        ObservationPhoto.PHOTO_FILENAME,
        ObservationPhoto.ORIGINAL_PHOTO_FILENAME
    };

    static {
        PROJECTION_MAP = new HashMap<String, String>();
        PROJECTION_MAP.put(ObservationPhoto._ID, ObservationPhoto._ID);
        PROJECTION_MAP.put(ObservationPhoto._CREATED_AT, ObservationPhoto._CREATED_AT);
        PROJECTION_MAP.put(ObservationPhoto._OBSERVATION_ID, ObservationPhoto._OBSERVATION_ID);
        PROJECTION_MAP.put(ObservationPhoto._PHOTO_ID, ObservationPhoto._PHOTO_ID);
        PROJECTION_MAP.put(ObservationPhoto._SYNCED_AT, ObservationPhoto._SYNCED_AT);
        PROJECTION_MAP.put(ObservationPhoto._UPDATED_AT, ObservationPhoto._UPDATED_AT);
        PROJECTION_MAP.put(ObservationPhoto.CREATED_AT, ObservationPhoto.CREATED_AT);
        PROJECTION_MAP.put(ObservationPhoto.UUID, ObservationPhoto.UUID);
        PROJECTION_MAP.put(ObservationPhoto.ID, ObservationPhoto.ID);
        PROJECTION_MAP.put(ObservationPhoto.OBSERVATION_ID, ObservationPhoto.OBSERVATION_ID);
        PROJECTION_MAP.put(ObservationPhoto.PHOTO_ID, ObservationPhoto.PHOTO_ID);
        PROJECTION_MAP.put(ObservationPhoto.POSITION, ObservationPhoto.POSITION);
        PROJECTION_MAP.put(ObservationPhoto.UPDATED_AT, ObservationPhoto.UPDATED_AT);
        PROJECTION_MAP.put(ObservationPhoto.IS_DELETED, ObservationPhoto.IS_DELETED);
        PROJECTION_MAP.put(ObservationPhoto.PHOTO_URL, ObservationPhoto.PHOTO_URL);
        PROJECTION_MAP.put(ObservationPhoto.PHOTO_FILENAME, ObservationPhoto.PHOTO_FILENAME);
        PROJECTION_MAP.put(ObservationPhoto.ORIGINAL_PHOTO_FILENAME, ObservationPhoto.ORIGINAL_PHOTO_FILENAME);
    }

    public ObservationPhoto() {}

    public ObservationPhoto(Cursor c) {
        if (c.getPosition() == -1) c.moveToFirst();
        BetterCursor bc = new BetterCursor(c);
        this._id = bc.getInt(_ID);
        this._created_at = bc.getTimestamp(_CREATED_AT);
        this._created_at_was = this._created_at;
        this._observation_id = bc.getInteger(_OBSERVATION_ID);
        this._observation_id_was = this._observation_id;
        this._photo_id = bc.getInteger(_PHOTO_ID);
        this._photo_id_was = this._photo_id;
        this._synced_at = bc.getTimestamp(_SYNCED_AT);
        this._synced_at_was = this._synced_at;
        this._updated_at = bc.getTimestamp(_UPDATED_AT);
        this._updated_at_was = this._updated_at;
        this.created_at = bc.getTimestamp(CREATED_AT);
        this.created_at_was = this.created_at;
        this.uuid = bc.getString(UUID);
        this.id = bc.getInteger(ID);
        this.id_was = this.id;
        this.observation_id = bc.getInteger(OBSERVATION_ID);
        this.observation_id_was = this.observation_id;
        this.photo_id = bc.getInteger(PHOTO_ID);
        this.photo_id_was = this.photo_id;
        this.position = bc.getInteger(POSITION);
        this.position_was = this.position;
        this.updated_at = bc.getTimestamp(UPDATED_AT);
        this.is_deleted_was = this.is_deleted;
        this.is_deleted = bc.getBoolean(IS_DELETED);
        this.updated_at_was = this.updated_at;
        this.photo_url = bc.getString(PHOTO_URL);
        this.photo_filename = bc.getString(PHOTO_FILENAME);
        this.original_photo_filename = bc.getString(ORIGINAL_PHOTO_FILENAME);
    }

    public ObservationPhoto(BetterJSONObject o) {
        this._created_at = o.getTimestamp("_created_at");
        this._created_at_was = this._created_at;
        this._observation_id = o.getInteger("_observation_id");
        this._observation_id_was = this._observation_id;
        this._synced_at = o.getTimestamp("_synced_at");
        this._synced_at_was = this._synced_at;
        this._updated_at = o.getTimestamp("_updated_at");
        this._updated_at_was = this._updated_at;
        this.created_at = o.getTimestamp("created_at");
        this.created_at_was = this.created_at;
        this.uuid = o.getString("uuid");
        this.id = o.getInteger("id");
        this.id_was = this.id;
        this.observation_id = o.getInteger("observation_id");
        this.observation_id_was = this.observation_id;
        if (o.has("photo_id")) {
            this.photo_id = o.getInteger("photo_id");
            this.photo_id_was = this.photo_id;
            this._photo_id = o.getInteger("photo_id");
            this._photo_id_was = this._photo_id;
        }
        this.position = o.getInteger("position");
        this.position_was = this.position;
        this.updated_at = o.getTimestamp("updated_at");
        this.updated_at_was = this.updated_at;
        
        String photoUrlSize = "large_url";
        if (o.has(photoUrlSize)) {
        	this.photo_url = o.getString(photoUrlSize);
        } else {
        	try {
				this.photo_url = o.getJSONObject("photo").getString(photoUrlSize);
			} catch (Exception e) {
				e.printStackTrace();
			}
        }

        if (o.has("photo")) {
            JSONObject photo = o.getJSONObject("photo");
            if ((this.photo_url == null) && (photo.has("url"))) this.photo_url = photo.optString("url");

            this.photo_id = photo.optInt("id");
            this.photo_id_was = this.photo_id;
            this._photo_id = this.photo_id;
            this._photo_id_was = this._photo_id;
        }

        if ((this.photo_url == null) && (o.has("url"))) {
            this.photo_url = o.getString("url");
        }

        if (this.photo_url != null) {
            String extension = this.photo_url.substring(this.photo_url.lastIndexOf(".") + 1);
            this.photo_url = this.photo_url.substring(0, this.photo_url.lastIndexOf('/') + 1) + "large." + extension;
        }
    }

    @Override
    public String toString() {
        return "ObservationPhoto(id: " + id + ", _id: " + _id + ", photo_url: " + photo_url + ", photo_filename: " + photo_filename + ", photo_id: " + photo_id + ", uuid: " + uuid + ", obs_id: " + observation_id + ", _obs_id: " + _observation_id + ")";
    }

    public JSONObject toJSONObject() {
        BetterJSONObject bo = new BetterJSONObject();
        bo.put("_created_at", _created_at);
        bo.put("_observation_id", _observation_id);
        bo.put("_photo_id", _photo_id);
        bo.put("_synced_at", _synced_at);
        bo.put("_updated_at", _updated_at);
        bo.put("created_at", created_at);
        bo.put("uuid", uuid);
        bo.put("id", id);
        bo.put("observation_id", observation_id);
        bo.put("photo_id", photo_id);
        bo.put("position", position);
        bo.put("updated_at", updated_at);

        return bo.getJSONObject();
    }

    public Uri getUri() {
        if (_id == null) {
            return null;
        } else {
            return ContentUris.withAppendedId(CONTENT_URI, _id);
        }
    }

    public void merge(ObservationPhoto observation_photo) {
        if (observation_photo.updated_at != null && this._updated_at.before(observation_photo.updated_at)) {
            // overwrite
            this.created_at = observation_photo.created_at;
            this.id = observation_photo.id;
            this.observation_id = observation_photo.observation_id;
            this.photo_id = observation_photo.photo_id;
            this.position = observation_photo.position;
            this.updated_at = observation_photo.updated_at;
            this.uuid = observation_photo.uuid;

        } else {
            // set if null
            if (this.created_at == null) { this.created_at = observation_photo.created_at; }
            if (this.id == null) { this.id = observation_photo.id; }
            if (this.observation_id == null) { this.observation_id = observation_photo.observation_id; }
            if (this.photo_id == null) { this.photo_id = observation_photo.photo_id; }
            if (this.position == null) { this.position = observation_photo.position; }
            if (this.updated_at == null) { this.updated_at = observation_photo.updated_at; }
            if (this.uuid == null) { this.uuid = observation_photo.uuid; }

        }
    }

    public ContentValues getContentValues() {
        ContentValues cv = new ContentValues();
        if (created_at != null) { cv.put(CREATED_AT, created_at.getTime()); }
        cv.put(ID, id);
        cv.put(OBSERVATION_ID, observation_id);
        cv.put(_OBSERVATION_ID, _observation_id);
        cv.put(PHOTO_ID, photo_id);
        cv.put(POSITION, position);
        cv.put(PHOTO_URL, photo_url);
        cv.put(PHOTO_FILENAME, photo_filename);
        cv.put(ORIGINAL_PHOTO_FILENAME, original_photo_filename);
        cv.put(IS_DELETED, is_deleted);
        if (updated_at != null) { cv.put(UPDATED_AT, updated_at.getTime()); }
        if (uuid != null) { cv.put(UUID, uuid); }

        return cv;
    }

    public ArrayList<NameValuePair> getParams() {
        final ArrayList<NameValuePair> params = new ArrayList<NameValuePair>();
        if (observation_id != null) { params.add(new BasicNameValuePair("observation_photo[observation_id]", observation_id.toString())); }
        if (photo_id != null) { params.add(new BasicNameValuePair("observation_photo[photo_id]", photo_id.toString())); }
        if (position != null) { params.add(new BasicNameValuePair("observation_photo[position]", position.toString())); }
        if (uuid != null) { params.add(new BasicNameValuePair("observation_photo[uuid]", uuid)); }

        return params;
    }

    public static String sqlCreate() {
        return "CREATE TABLE " + TABLE_NAME + " ("
                + ObservationPhoto._ID + " INTEGER PRIMARY KEY,"
                + "_created_at INTEGER,"
                + "_observation_id INTEGER,"
                + "_photo_id INTEGER,"
                + "_synced_at INTEGER,"
                + "_updated_at INTEGER,"
                + "created_at INTEGER,"
                + "uuid TEXT,"
                + "id INTEGER,"
                + "observation_id INTEGER,"
                + "photo_id INTEGER,"
                + "position INTEGER,"
                + "updated_at INTEGER,"
                + "is_deleted INTEGER,"
                + "photo_url TEXT,"
                + "photo_filename TEXT,"
                + "original_photo_filename TEXT"
                + ");";
    }

    public boolean _created_at_changed() { return !String.valueOf(_created_at).equals(String.valueOf(_created_at_was)); }
    public boolean _observation_id_changed() { return !String.valueOf(_observation_id).equals(String.valueOf(_observation_id_was)); }
    public boolean _photo_id_changed() { return !String.valueOf(_photo_id).equals(String.valueOf(_photo_id_was)); }
    public boolean _synced_at_changed() { return !String.valueOf(_synced_at).equals(String.valueOf(_synced_at_was)); }
    public boolean _updated_at_changed() { return !String.valueOf(_updated_at).equals(String.valueOf(_updated_at_was)); }
    public boolean created_at_changed() { return !String.valueOf(created_at).equals(String.valueOf(created_at_was)); }
    public boolean id_changed() { return !String.valueOf(id).equals(String.valueOf(id_was)); }
    public boolean observation_id_changed() { return !String.valueOf(observation_id).equals(String.valueOf(observation_id_was)); }
    public boolean photo_id_changed() { return !String.valueOf(photo_id).equals(String.valueOf(photo_id_was)); }
    public boolean position_changed() { return !String.valueOf(position).equals(String.valueOf(position_was)); }
    public boolean updated_at_changed() { return !String.valueOf(updated_at).equals(String.valueOf(updated_at_was)); }
    public boolean is_deleted_changed() { return is_deleted != is_deleted_was; }


    public boolean isDirty() {
        if (_created_at_changed()) { return true; }
        if (_observation_id_changed()) { return true; }
        if (_photo_id_changed()) { return true; }
        if (_synced_at_changed()) { return true; }
        if (_updated_at_changed()) { return true; }
        if (created_at_changed()) { return true; }
        if (id_changed()) { return true; }
        if (observation_id_changed()) { return true; }
        if (photo_id_changed()) { return true; }
        if (position_changed()) { return true; }
        if (updated_at_changed()) { return true; }
        if (is_deleted_changed()) { return true; }

        return false;
    }
}
// END GENERATED BY /Users/kueda/projects/eclipse/workspace/iNaturalist/rails2android.rb AT Mon Dec 26 19:18:32 -0500 2011
