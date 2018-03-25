<?xml version="1.0" encoding="utf-8"?>

    <RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="@color/background_colors">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal"
            android:showDividers="middle">

            <LinearLayout
                android:layout_width="0dp"
                android:layout_height="wrap_content"
                android:layout_weight="1"
                android:gravity="center_horizontal"
                android:orientation="vertical">

                <ImageView
                    android:layout_width="64dp"
                    android:layout_height="64dp"
                    android:layout_marginTop="32dp"
                    android:src="@drawable/generic_team_a" />

                <EditText
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:fontFamily="sans-serif-medium"
                    android:hint="@string/team_name"
                    android:inputType="text"
                    android:text=""
                    android:textColor="@color/team_name_colors"
                    android:textSize="14sp" />

                <TextView
                    android:id="@+id/team_a_score"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:fontFamily="sans-serif-light"
                    android:text="@string/zero"
                    android:textColor="@color/score_colors"
                    android:textSize="56sp" />

                <LinearLayout
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:orientation="vertical">

                    <Button
                        android:layout_width="match_parent"
                        android:layout_height="0dp"
                        android:layout_weight="1"
                        android:onClick="addSixForTeamB"
                        android:text="@string/touchdown"
                        android:textColor="@color/button_colors" />

                    <Button
                        android:layout_width="match_parent"
                        android:layout_height="0dp"
                        android:layout_weight="1"
                        android:onClick="addThreeForTeamA"
                        android:text="@string/field_goal"
                        android:textColor="@color/button_colors" />

                    <Button
                        android:layout_width="match_parent"
                        android:layout_height="0dp"
                        android:layout_weight="1"
                        android:onClick="addOneForTeamA"
                        android:text="@string/safety"
                        android:textColor="@color/button_colors" />

                </LinearLayout>

            </LinearLayout>

            <View
                android:layout_width="1dp"
                android:layout_height="match_parent"
                android:layout_centerHorizontal="true"
                android:layout_marginTop="16dp"
                android:background="@android:color/darker_gray"></View>

            <LinearLayout
                android:layout_width="0dp"
                android:layout_height="wrap_content"
                android:layout_weight="1"
                android:gravity="center_horizontal"
                android:orientation="vertical">

                <ImageView
                    android:layout_width="64dp"
                    android:layout_height="64dp"
                    android:layout_marginTop="32dp"
                    android:src="@drawable/generic_team_b" />

                <EditText
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:fontFamily="sans-serif-medium"
                    android:hint="@string/team_name"
                    android:inputType="text"
                    android:text=""
                    android:textColor="@color/team_name_colors"
                    android:textSize="14sp" />

                <TextView
                    android:id="@+id/team_b_score"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:fontFamily="sans-serif-light"
                    android:text="@string/zero"
                    android:textColor="@color/score_colors"
                    android:textSize="56sp" />

                <LinearLayout
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:orientation="vertical">

                    <Button
                        android:layout_width="match_parent"
                        android:layout_height="0dp"
                        android:layout_weight="1"
                        android:onClick="addSixForTeamB"
                        android:text="@string/touchdown"
                        android:textColor="@color/button_colors" />

                    <Button
                        android:layout_width="match_parent"
                        android:layout_height="0dp"
                        android:layout_weight="1"
                        android:onClick="addThreeForTeamB"
                        android:text="@string/field_goal"
                        android:textColor="@color/button_colors" />

                    <Button
                        android:layout_width="match_parent"
                        android:layout_height="0dp"
                        android:layout_weight="1"
                        android:onClick="addOneForTeamB"
                        android:text="@string/safety"
                        android:textColor="@color/button_colors" />

                </LinearLayout>

            </LinearLayout>

        </LinearLayout>

        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignParentBottom="true"
            android:layout_centerHorizontal="true"
            android:layout_marginBottom="32dp"
            android:onClick="resetScore"
            android:text="@string/reset"
            android:textColor="@color/button_colors" />

    </RelativeLayout>
