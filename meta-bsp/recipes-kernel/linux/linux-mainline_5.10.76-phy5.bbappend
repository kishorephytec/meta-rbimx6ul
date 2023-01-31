FILESEXTRAPATHS_prepend := "${THISDIR}:"

INTREE_DEFCONFIG = "imx6_Rb_defconfig"
COMPATIBLE_MACHINE = "ruggedboard-imx6ul"

SRC_URI += "file://fragment.cfg \
	file://0001-Add-RB-imx6ul-dts-to-makefile.patch \
	file://0002-Device-tree-support-for-RB-imx6ul-rdk.patch \
	file://0003-Add-defconfig-file-for-RB-imx6ul.patch \
	file://0004-Add-SIERRAWIRELESS-wp76xx-4g-module-to-RB-imx6ul.patch \
	file://0005-Add-wilc1000-driver-which-supports-both-wilc1000-wil.patch \
	file://0006-Ec25-Ec200-support-for-4G-to-work.patch \
"
