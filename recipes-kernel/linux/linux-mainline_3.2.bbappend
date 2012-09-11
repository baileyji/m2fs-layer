FILESEXTRAPATHS_prepend := "${THISDIR}/linux-mainline-3.2:${THISDIR}/linux-mainline-3.2/${MACHINE}:"

# The main PR is now using MACHINE_KERNEL_PR, for omap3 see conf/machine/include/omap3.inc
MACHINE_KERNEL_PR_append = "b"

SRC_URI += "file://beagle/linux-0002-Add-support-for-RTC-backup-battery-recharge.patch \
            file://beagle/linux-0003-Add-support-for-Aptina-MT9P031-sensor-to-BBxM.patch \
            file://beagle/linux-0005-Put-the-IVA2-DPLL-in-stop-mode-before-un-reset-IVA2.patch \
           \
            file://beagleboard/defconfig"

#            file://beagle/linux-0003-Add-support-for-MT9P031-Aptina-image-sensor-driver.patch \
