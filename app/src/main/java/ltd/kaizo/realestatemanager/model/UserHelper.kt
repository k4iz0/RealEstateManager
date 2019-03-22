package ltd.kaizo.realestatemanager.model

import com.google.android.gms.tasks.Task
import com.google.firebase.firestore.*
import ltd.kaizo.realestatemanager.utils.COLLECTION_NAME

object UserHelper {
    val usersCollection: CollectionReference
        get() = FirebaseFirestore.getInstance().collection(COLLECTION_NAME)
//
//    val allUser: Query = UserHelper.usersCollection
//            .orderBy("username")


    fun createUser(uid: String, username: String, urlPicture: String, email: String): Task<Void> {

        val userToCreate = User(uid, username, urlPicture, email)
        return UserHelper.usersCollection.document(uid).set(userToCreate)

    }


    fun getUser(uid: String): Task<DocumentSnapshot> {

        return UserHelper.usersCollection.document(uid).get()

    }

    /**
     * Update username task.
     *
     * @param username the username
     * @param uid      the uid
     * @return the task
     */
    // --- UPDATE ---
    fun updateUsername(username: String, uid: String): Task<Void> {
        return UserHelper.usersCollection.document(uid).update("username", username)

    }

    /**
     * Update email task.
     *
     * @param email the email
     * @param uid   the uid
     * @return the task
     */
    fun updateEmail(email: String, uid: String): Task<Void> {
        return UserHelper.usersCollection.document(uid).update("email", email)

    }

    // --- DELETE ---

    /**
     * Delete user task.
     *
     * @param uid the uid
     * @return the task
     */
    fun deleteUser(uid: String): Task<Void> {

        return UserHelper.usersCollection.document(uid).delete()

    }
}
