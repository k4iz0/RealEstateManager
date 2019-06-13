package ltd.kaizo.realestatemanager.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J,\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bJ\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\u0006\u0010\n\u001a\u00020\u000bJ\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bJ\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bR\u0014\u0010\u0003\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0014"}, d2 = {"Lltd/kaizo/realestatemanager/model/UserHelper;", "", "()V", "usersCollection", "Lcom/google/firebase/firestore/CollectionReference;", "getUsersCollection", "()Lcom/google/firebase/firestore/CollectionReference;", "createUser", "Lcom/google/android/gms/tasks/Task;", "Ljava/lang/Void;", "uid", "", "username", "urlPicture", "email", "deleteUser", "getUser", "Lcom/google/firebase/firestore/DocumentSnapshot;", "updateEmail", "updateUsername", "app_debug"})
public final class UserHelper {
    public static final ltd.kaizo.realestatemanager.model.UserHelper INSTANCE = null;
    
    private final com.google.firebase.firestore.CollectionReference getUsersCollection() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.tasks.Task<java.lang.Void> createUser(@org.jetbrains.annotations.NotNull()
    java.lang.String uid, @org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String urlPicture, @org.jetbrains.annotations.NotNull()
    java.lang.String email) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.tasks.Task<com.google.firebase.firestore.DocumentSnapshot> getUser(@org.jetbrains.annotations.NotNull()
    java.lang.String uid) {
        return null;
    }
    
    /**
     * * Update username task.
     *     *
     *     * @param username the username
     *     * @param uid      the uid
     *     * @return the task
     */
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.tasks.Task<java.lang.Void> updateUsername(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String uid) {
        return null;
    }
    
    /**
     * * Update email task.
     *     *
     *     * @param email the email
     *     * @param uid   the uid
     *     * @return the task
     */
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.tasks.Task<java.lang.Void> updateEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String uid) {
        return null;
    }
    
    /**
     * * Delete user task.
     *     *
     *     * @param uid the uid
     *     * @return the task
     */
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.tasks.Task<java.lang.Void> deleteUser(@org.jetbrains.annotations.NotNull()
    java.lang.String uid) {
        return null;
    }
    
    private UserHelper() {
        super();
    }
}