package kiwi.orbit.icons

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.res.vectorResource
import kiwi.orbit.R

@Composable
val Icon.FullScreenOff: VectorAsset
	get() {
		if (icon != null) return icon!!
		icon = vectorResource(id = R.drawable.ic_full_screen_off)
		return icon!!
	}

private var icon: VectorAsset? = null